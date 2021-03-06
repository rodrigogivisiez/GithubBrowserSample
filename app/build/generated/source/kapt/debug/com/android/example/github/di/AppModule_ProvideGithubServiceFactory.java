// Generated by Dagger (https://google.github.io/dagger).
package com.android.example.github.di;

import com.android.example.github.api.GithubService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideGithubServiceFactory implements Factory<GithubService> {
  private final AppModule module;

  public AppModule_ProvideGithubServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public GithubService get() {
    return Preconditions.checkNotNull(
        module.provideGithubService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideGithubServiceFactory create(AppModule module) {
    return new AppModule_ProvideGithubServiceFactory(module);
  }

  public static GithubService proxyProvideGithubService(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideGithubService(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
