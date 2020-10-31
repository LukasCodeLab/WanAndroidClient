package com.fengyongge.wanandroidclient.mvp.contract

import com.fengyongge.baseframework.mvp.IBasePresenter
import com.fengyongge.baseframework.mvp.IBaseView
import com.fengyongge.rxhttp.bean.BaseResponse
import com.fengyongge.rxhttp.exception.ResponseException
import com.fengyongge.wanandroidclient.bean.MyShareBean
import io.reactivex.Observable

class ShareContract {

    interface Presenter : IBasePresenter{
        fun postShare(title: String,link: String)
        fun getShareList(pageNum: Int)
        fun postDeleteMyShare(id: Int)
    }

    interface Model {

        fun postShare(title: String,link: String): Observable<BaseResponse<String>>
        fun getShareList(pageNum: Int): Observable<BaseResponse<MyShareBean>>
        fun postDeleteMyShare(id: Int): Observable<BaseResponse<String>>

    }

    interface View : IBaseView{
        fun postShareShow(data: BaseResponse<String>)
        fun getShareListShow(data: BaseResponse<MyShareBean>)
        fun postDeleteMyShareShow(data: BaseResponse<String>)
        fun onError(data: ResponseException)
    }


}