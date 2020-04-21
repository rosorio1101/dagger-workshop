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
public final class HeadPartModule_ProvideRightEyeFactory implements Factory<Eye> {
  @Override
  public Eye get() {
    return provideRightEye();
  }

  public static HeadPartModule_ProvideRightEyeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Eye provideRightEye() {
    return Preconditions.checkNotNull(HeadPartModule.provideRightEye(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final HeadPartModule_ProvideRightEyeFactory INSTANCE = new HeadPartModule_ProvideRightEyeFactory();
  }
}
