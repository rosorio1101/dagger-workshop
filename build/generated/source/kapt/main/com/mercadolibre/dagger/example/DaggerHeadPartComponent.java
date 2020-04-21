package com.mercadolibre.dagger.example;

import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHeadPartComponent implements HeadPartComponent {
  private DaggerHeadPartComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static HeadPartComponent create() {
    return new Builder().build();
  }

  @Override
  public Head buildHead() {
    return HeadPartModule_ProvideHeadFactory.provideHead(HeadPartModule_ProvideLeftEyeFactory.provideLeftEye(), HeadPartModule_ProvideRightEyeFactory.provideRightEye());}

  public static final class Builder {
    private Builder() {
    }

    public HeadPartComponent build() {
      return new DaggerHeadPartComponent();
    }
  }
}
