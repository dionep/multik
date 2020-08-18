// Generated by Dagger (https://dagger.dev).
package com.airatlovesmusic.feature1;

import com.airatlovesmusic.base.BaseNetwork;
import com.airatlovesmusic.base.BaseRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Feature1DependentModule_AppModelFactory implements Factory<Feature1Dependent> {
  private final Feature1DependentModule module;

  private final Provider<BaseRepository> baseRepositoryProvider;

  private final Provider<BaseNetwork> baseNetworkProvider;

  public Feature1DependentModule_AppModelFactory(Feature1DependentModule module,
      Provider<BaseRepository> baseRepositoryProvider, Provider<BaseNetwork> baseNetworkProvider) {
    this.module = module;
    this.baseRepositoryProvider = baseRepositoryProvider;
    this.baseNetworkProvider = baseNetworkProvider;
  }

  @Override
  public Feature1Dependent get() {
    return appModel(module, baseRepositoryProvider.get(), baseNetworkProvider.get());
  }

  public static Feature1DependentModule_AppModelFactory create(Feature1DependentModule module,
      Provider<BaseRepository> baseRepositoryProvider, Provider<BaseNetwork> baseNetworkProvider) {
    return new Feature1DependentModule_AppModelFactory(module, baseRepositoryProvider, baseNetworkProvider);
  }

  public static Feature1Dependent appModel(Feature1DependentModule instance,
      BaseRepository baseRepository, BaseNetwork baseNetwork) {
    return Preconditions.checkNotNull(instance.appModel(baseRepository, baseNetwork), "Cannot return null from a non-@Nullable @Provides method");
  }
}
