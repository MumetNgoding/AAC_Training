package founder.nugroho.aac_training.Di

import android.app.Application
import android.content.Context
import dagger.Component
import founder.nugroho.aac_training.Di.Modules.ApiModule
import founder.nugroho.aac_training.Di.Modules.AppModule
import founder.nugroho.aac_training.Di.Modules.NetModule
import founder.nugroho.aac_training.Di.Modules.RepositoryModule
import founder.nugroho.aac_training.Repo.CatalogRepository
import founder.nugroho.aac_training.ViewModel.ProductViewModel
import javax.inject.Singleton


@Singleton
@Component(
    modules = arrayOf(
        AppModule::class,
        NetModule::class,
        RepositoryModule::class,
        ApiModule::class
    )
)


interface AppComponent {
    fun inject(viewModelModule: ProductViewModel)
    fun inject(activity: Context)

    fun provideCatalogRepository() : CatalogRepository

    companion object Factory {
//        fun create(app: Application, baseUrl : String)
//        : AppComponent {
//            val appComponent = DaggerAppComponent.builder()
//                .appModule(AppModule(app))
//                .apiModule(ApiModule())
//                .netModule(NetModule(baseUrl))
//                .repositoryModule(RepositoryModule())
//                .build()
//            return appComponent
//        }
    }
}