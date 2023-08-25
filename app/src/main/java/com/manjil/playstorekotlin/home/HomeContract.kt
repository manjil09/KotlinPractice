package com.manjil.playstorekotlin.home

import com.manjil.playstorekotlin.home.app.AppPojo
import com.manjil.playstorekotlin.home.category.CategoryPojo

interface HomeContract {
    interface Model{

    }
    interface View{
        fun getCategoryList(): List<CategoryPojo>
        fun getAppList(): List<AppPojo>
    }
    interface Presenter{
        fun getCategoryList(): List<CategoryPojo>
    }
}