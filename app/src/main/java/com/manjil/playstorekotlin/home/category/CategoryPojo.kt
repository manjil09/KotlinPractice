package com.manjil.playstorekotlin.home.category

import com.manjil.playstorekotlin.home.app.AppPojo

data class CategoryPojo(val name: String, val appList: List<AppPojo>) {
}