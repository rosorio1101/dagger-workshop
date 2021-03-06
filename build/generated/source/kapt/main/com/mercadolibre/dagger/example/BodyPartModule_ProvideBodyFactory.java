package com.mercadolibre.dagger.example;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class BodyPartModule_ProvideBodyFactory implements Factory<Body> {
  private final Provider<Head> headProvider;

  public BodyPartModule_ProvideBodyFactory(Provider<Head> headProvider) {
    this.headProvider = headProvider;
  }

  @Override
  public Body get() {
    return provideBody(headProvider.get());
  }

  public static BodyPartModule_ProvideBodyFactory create(Provider<Head> headProvider) {
    return new BodyPartModule_ProvideBodyFactory(headProvider);
  }

  public static Body provideBody(Head head) {
    return Preconditions.checkNotNull(BodyPartModule.provideBody(head), "Cannot return null from a non-@Nullable @Provides method");
  }
}
