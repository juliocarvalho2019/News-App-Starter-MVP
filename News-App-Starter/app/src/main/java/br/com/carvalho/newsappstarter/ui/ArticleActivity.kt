package br.com.carvalho.newsappstarter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.carvalho.newsappstarter.R

class ArticleActivity : AbstractActivity() {
    //    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_article)
//    }
    override fun getLayout(): Int = R.layout.activity_article

    override fun onInject() {

    }
}