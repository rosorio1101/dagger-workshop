package com.mercadolibre.dagger.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mercadolibre/dagger/example/BodyPartModule;", "", "Companion", "workshop-dagger"})
@dagger.Module()
public abstract interface BodyPartModule {
    public static final com.mercadolibre.dagger.example.BodyPartModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static com.mercadolibre.dagger.example.Body provideBody(@org.jetbrains.annotations.NotNull()
    com.mercadolibre.dagger.example.Head head) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/mercadolibre/dagger/example/BodyPartModule$Companion;", "", "()V", "provideBody", "Lcom/mercadolibre/dagger/example/Body;", "head", "Lcom/mercadolibre/dagger/example/Head;", "workshop-dagger"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.mercadolibre.dagger.example.Body provideBody(@org.jetbrains.annotations.NotNull()
        com.mercadolibre.dagger.example.Head head) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}