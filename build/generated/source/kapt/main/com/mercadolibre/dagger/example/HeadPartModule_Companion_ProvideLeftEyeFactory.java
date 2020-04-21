package com.mercadolibre.dagger.example;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeadPartModule_Companion_ProvideLeftEyeFactory implements Factory<Eye> {
  @Override
  public Eye get() {
    return provideLeftEye();
  }

  public static HeadPartModule_Companion_ProvideLeftEyeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Eye provideLeftEye() {
    return Preconditions.checkNotNull(HeadPartModule.Companion.provideLeftEye(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final HeadPartModule_Companion_ProvideLeftEyeFactory INSTANCE = new HeadPartModule_Companion_ProvideLeftEyeFactory();
  }
}
