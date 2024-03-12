package dagger.android.ksp

import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 *
 */
@Component(
    modules = [
        AndroidInjectionModule::class,
        FragmentModule::class,
    ]
)
interface MyComponent {
}
