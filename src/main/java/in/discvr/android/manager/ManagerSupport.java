package in.discvr.android.manager;

import in.discvr.android.api.ApiClient;
import in.discvr.android.utils.AppConfig;

/**
 * Abstract class for logic layer
 * @author shuklaalok7
 * @since 7/4/15 15:05
 */
public abstract class ManagerSupport {

    protected ApiClient apiClient;

    protected ManagerSupport() {
        this.apiClient = new ApiClient(AppConfig.CLIENT_ID, AppConfig.CLIENT_SECRET);
    }
}
