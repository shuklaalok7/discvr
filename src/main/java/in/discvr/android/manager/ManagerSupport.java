package in.discvr.android.manager;

import in.discvr.android.api.ApiClient;
import in.discvr.android.models.PersistentObject;
import in.discvr.android.utils.AppConfig;

/**
 * Abstract class for logic layer
 * @author shuklaalok7
 * @since 7/4/15 15:05
 */
public abstract class ManagerSupport {

    protected ApiClient apiClient;

    public ManagerSupport() {
        this.apiClient = new ApiClient(AppConfig.CLIENT_ID, AppConfig.CLIENT_SECRET);
    }

//    4 Basic CRUD methods
//    These methods are do be implemented to operate on the tables in SQLite, if we use it
//    The implementation of these methods will call DAO layer to actually do the operations in DB
    public <T extends PersistentObject> long save(T t) {
        return 0;
    }
    protected <T extends PersistentObject> T get(Class<T> tClass, long id) {
        return null;
    }
    public <T extends PersistentObject> T update(T t) {
        return null;
    }
    protected <T extends PersistentObject> T delete(Class<T> tClass, long id) {
        return null;
    }

}
