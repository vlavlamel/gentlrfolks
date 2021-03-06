package com.example.gentlefolks.presentation.opinionsScreen.di;

import com.example.gentlefolks.di.scope.ActivityScope;
import com.example.gentlefolks.di.scope.FragmentScope;
import com.example.gentlefolks.presentation.base.EventModelPresenter;
import com.example.gentlefolks.presentation.details.DetailsFragment;
import com.example.gentlefolks.presentation.details.di.DetailsModule;
import com.example.gentlefolks.presentation.opinionsScreen.OpinionPresenter;
import com.example.gentlefolks.presentation.opinionsScreen.OpinionUiEvent;
import com.example.gentlefolks.presentation.opinionsScreen.OpinionUiModel;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by vl.melnikov on 25.11.2017.
 */

@Module
public abstract class OpinionModule {

	@Binds
	@ActivityScope
	public abstract EventModelPresenter<OpinionUiEvent, OpinionUiModel> providePresenter(OpinionPresenter presenter);

	@FragmentScope
	@ContributesAndroidInjector(modules = {DetailsModule.class})
	abstract DetailsFragment contributeDetailsFragmentInjector();

}
