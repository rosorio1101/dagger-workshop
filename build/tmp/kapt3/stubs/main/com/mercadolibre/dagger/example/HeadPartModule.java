package com.mercadolibre.dagger.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mercadolibre/dagger/example/HeadPartModule;", "", "Companion", "workshop-dagger"})
@dagger.Module()
public abstract interface HeadPartModule {
    public static final com.mercadolibre.dagger.example.HeadPartModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "eyeL")
    @dagger.Provides()
    public static com.mercadolibre.dagger.example.Eye provideLeftEye() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "eyeR")
    @dagger.Provides()
    public static com.mercadolibre.dagger.example.Eye provideRightEye() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static com.mercadolibre.dagger.example.Head provideHead(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "eyeL")
    com.mercadolibre.dagger.example.Eye eyeL, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "eyeR")
    com.mercadolibre.dagger.example.Eye eyeR) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/mercadolibre/dagger/example/HeadPartModule$Companion;", "", "()V", "provideHead", "Lcom/mercadolibre/dagger/example/Head;", "eyeL", "Lcom/mercadolibre/dagger/example/Eye;", "eyeR", "provideLeftEye", "provideRightEye", "workshop-dagger"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "eyeL")
        @dagger.Provides()
        public final com.mercadolibre.dagger.example.Eye provideLeftEye() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "eyeR")
        @dagger.Provides()
        public final com.mercadolibre.dagger.example.Eye provideRightEye() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.mercadolibre.dagger.example.Head provideHead(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "eyeL")
        com.mercadolibre.dagger.example.Eye eyeL, @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "eyeR")
        com.mercadolibre.dagger.example.Eye eyeR) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}