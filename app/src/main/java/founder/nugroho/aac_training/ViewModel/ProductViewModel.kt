package founder.nugroho.aac_training.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations.switchMap
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import founder.nugroho.aac_training.Repo.CatalogRepository
import javax.inject.Inject

class ProductViewModel : ViewModel() {
    val searchInput: MutableLiveData<String>
            = MutableLiveData()

    val searchReult = switchMap(searchInput){
        if (it.length >=1){
            repository.doSearch(it)

        } else {
            MutableLiveData()
        }
    }

    private lateinit var repository: CatalogRepository
    @Inject fun init(repository: CatalogRepository) {
        this.repository = repository
    }

    fun search(term : String) {
        searchInput.value = (term)
    }

    companion object {
        fun create(activity: FragmentActivity)
        : ProductViewModel {
            var productDetail = ViewModelProviders.of(activity)
                .get(ProductViewModel::class.java)

            return productDetail
        }
    }
}