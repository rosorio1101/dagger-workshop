package com.mercadolibre.dagger.example

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

class Eye(
    val color : String
)

class Head(
    val eyeL: Eye,
    val eyeR: Eye
)

class Body(
    val head: Head
)

@Module
interface HeadPartModule {
    companion object {
        @JvmStatic
        @Provides
        @Named("eyeL")
        fun provideLeftEye() = Eye("brown")

        @JvmStatic
        @Provides
        @Named("eyeR")
        fun provideRightEye() = Eye("black")

        @JvmStatic
        @Provides
        fun provideHead(
            @Named("eyeL") eyeL: Eye,
            @Named("eyeR") eyeR: Eye
        ) = Head(eyeL, eyeR)
    }
}

@Component(
    modules = [HeadPartModule::class]
)
interface HeadPartComponent {
    fun buildHead() : Head
}

@Module
interface BodyPartModule {
    companion object {
        @JvmStatic
        @Provides
        @Singleton
        fun provideBody(head: Head) = Body(head)
    }
}

@Singleton
@Component(
    modules = [
        BodyPartModule::class
    ],
    dependencies = [
        HeadPartComponent::class
    ]
)
interface BodyPartComponent {
    fun buildBody(): Body
    fun inject(human: Human)
}

class Human {
    @Inject
    lateinit var body: Body

    init {
        ComponentWrapper.component.inject(this)
    }
}

object ComponentWrapper {
    val component : BodyPartComponent by lazy {
        DaggerBodyPartComponent.builder()
            .headPartComponent(DaggerHeadPartComponent.create())
            .build()
    }
}

fun main() {
    val component = ComponentWrapper.component
    val body = component.buildBody()

    println(body)
    println(body.head)
    println(body.head.eyeL.color)
    println(body.head.eyeR.color)

    println("#############################")

    val human = Human()
    println(human)
    println(human.body)
}


//Scopes
//Subcomponents
//Multibindings
//Test