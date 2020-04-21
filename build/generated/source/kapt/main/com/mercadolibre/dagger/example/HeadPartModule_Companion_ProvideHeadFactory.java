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
public final class HeadPartModule_Companion_ProvideHeadFactory implements Factory<Head> {
  private final Provider<Eye> eyeLProvider;

  private final Provider<Eye> eyeRProvider;

  public HeadPartModule_Companion_ProvideHeadFactory(Provider<Eye> eyeLProvider,
      Provider<Eye> eyeRProvider) {
    this.eyeLProvider = eyeLProvider;
    this.eyeRProvider = eyeRProvider;
  }

  @Override
  public Head get() {
    return provideHead(eyeLProvider.get(), eyeRProvider.get());
  }

  public static HeadPartModule_Companion_ProvideHeadFactory create(Provider<Eye> eyeLProvider,
      Provider<Eye> eyeRProvider) {
    return new HeadPartModule_Companion_ProvideHeadFactory(eyeLProvider, eyeRProvider);
  }

  public static Head provideHead(Eye eyeL, Eye eyeR) {
    return Preconditions.checkNotNull(HeadPartModule.Companion.provideHead(eyeL, eyeR), "Cannot return null from a non-@Nullable @Provides method");
  }
}
