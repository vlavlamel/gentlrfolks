package com.example.gentlefolks.di;

import com.example.gentlefolks.api.ApiFactory;
import com.example.gentlefolks.di.scope.ActivityScope;
import com.example.gentlefolks.presentation.mainScreen.MainActivity;
import com.example.gentlefolks.presentation.mainScreen.di.MainActivityModule;
import com.example.gentlefolks.presentation.opinionsScreen.OpinionPresenter;
import com.example.gentlefolks.presentation.opinionsScreen.OpinionsActivity;
import com.example.gentlefolks.presentation.opinionsScreen.di.OpinionModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class AppModule {

	@Provides
	@Singleton
	static ApiFactory providesApiGetData() {
		return new ApiFactory();
	}

	@ActivityScope
	@ContributesAndroidInjector(modules = {MainActivityModule.class})
	abstract MainActivity contributeMainActivityInjector();

	@ActivityScope
	@ContributesAndroidInjector(modules = {OpinionModule.class})
	abstract OpinionsActivity contributeOpinionsActivityInjector();

}
