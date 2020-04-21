package com.mercadolibre.dagger.example;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Human_MembersInjector implements MembersInjector<Human> {
  private final Provider<Body> bodyProvider;

  public Human_MembersInjector(Provider<Body> bodyProvider) {
    this.bodyProvider = bodyProvider;
  }

  public static MembersInjector<Human> create(Provider<Body> bodyProvider) {
    return new Human_MembersInjector(bodyProvider);}

  @Override
  public void injectMembers(Human instance) {
    injectBody(instance, bodyProvider.get());
  }

  @InjectedFieldSignature("com.mercadolibre.dagger.example.Human.body")
  public static void injectBody(Human instance, Body body) {
    instance.body = body;
  }
}
