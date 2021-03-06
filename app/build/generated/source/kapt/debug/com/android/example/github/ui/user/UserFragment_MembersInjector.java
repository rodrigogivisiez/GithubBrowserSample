// Generated by Dagger (https://google.github.io/dagger).
package com.android.example.github.ui.user;

import android.arch.lifecycle.ViewModelProvider;
import com.android.example.github.AppExecutors;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UserFragment_MembersInjector implements MembersInjector<UserFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public UserFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<UserFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new UserFragment_MembersInjector(viewModelFactoryProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(UserFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  public static void injectViewModelFactory(
      UserFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectAppExecutors(UserFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
