package founder.nugroho.aac_training.Di.Modules

import dagger.Module
import dagger.Provides
import founder.nugroho.aac_training.Api.Catalog
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton //satu arah
    fun providesCatalogApi(retrofit: Retrofit) : Catalog {
        return  retrofit.create<Catalog>(
            Catalog::class.java
        )
    }
}