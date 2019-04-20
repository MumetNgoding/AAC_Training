package founder.nugroho.aac_training.Di.Modules

import dagger.Module
import dagger.Provides
import founder.nugroho.aac_training.Api.Catalog
import founder.nugroho.aac_training.Repo.CatalogRepository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideCatalogRepo(api: Catalog) : CatalogRepository {
        return CatalogRepository(api)
    }
}