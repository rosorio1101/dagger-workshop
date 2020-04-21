package com.mercadolibre.dagger.example;

import dagger.internal.DoubleCheck;
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
public final class DaggerBodyPartComponent implements BodyPartComponent {
  private Provider<Head> buildHeadProvider;

  private Provider<Body> provideBodyProvider;

  private DaggerBodyPartComponent(HeadPartComponent headPartComponentParam) {

    initialize(headPartComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final HeadPartComponent headPartComponentParam) {
    this.buildHeadProvider = new com_mercadolibre_dagger_example_HeadPartComponent_buildHead(headPartComponentParam);
    this.provideBodyProvider = DoubleCheck.provider(BodyPartModule_ProvideBodyFactory.create(buildHeadProvider));
  }

  @Override
  public Body buildBody() {
    return provideBodyProvider.get();}

  @Override
  public void inject(Human human) {
    injectHuman(human);}

  private Human injectHuman(Human instance) {
    Human_MembersInjector.injectBody(instance, provideBodyProvider.get());
    return instance;
  }

  public static final class Builder {
    private HeadPartComponent headPartComponent;

    private Builder() {
    }

    public Builder headPartComponent(HeadPartComponent headPartComponent) {
      this.headPartComponent = Preconditions.checkNotNull(headPartComponent);
      return this;
    }

    public BodyPartComponent build() {
      Preconditions.checkBuilderRequirement(headPartComponent, HeadPartComponent.class);
      return new DaggerBodyPartComponent(headPartComponent);
    }
  }

  private static class com_mercadolibre_dagger_example_HeadPartComponent_buildHead implements Provider<Head> {
    private final HeadPartComponent headPartComponent;

    com_mercadolibre_dagger_example_HeadPartComponent_buildHead(
        HeadPartComponent headPartComponent) {
      this.headPartComponent = headPartComponent;
    }

    @Override
    public Head get() {
      return Preconditions.checkNotNull(headPartComponent.buildHead(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
