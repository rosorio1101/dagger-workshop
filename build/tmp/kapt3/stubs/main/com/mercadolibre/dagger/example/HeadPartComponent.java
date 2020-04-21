package com.mercadolibre.dagger.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/mercadolibre/dagger/example/HeadPartComponent;", "", "buildHead", "Lcom/mercadolibre/dagger/example/Head;", "workshop-dagger"})
@dagger.Component(modules = {com.mercadolibre.dagger.example.HeadPartModule.class})
public abstract interface HeadPartComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mercadolibre.dagger.example.Head buildHead();
}