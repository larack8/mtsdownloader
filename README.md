# MtsDownloader

## About MtsDownloader

### Support
>1.multi-threaded download
>2.service in background download
>3.breakpoint download


## How To Use

 ** Config: **

 ```java
 	 MtsDownloader.getInstance()
                 .maxThread(10)                    //设置最大线程
                 .maxRetryCount(10)                //设置下载失败重试次数
                 .retrofit(myRetrofit)             //若需要自己的retrofit客户端,可在这里指定
                 .defaultSavePath(defaultSavePath) //设置默认的下载路径
                 .context(this)                    //自动安装需要Context
                 .autoInstall(true);               //下载完成自动安装，仅限7.0以下，7.0以上自行提供FileProvider
                 .download(url,savename,savepath)  //开始下载
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Observer<DownloadStatus>() {);
 ```


## Contact Me
- Github:  [https://github.com/larack8](https://github.com/larack8)
- Email:   larack@126.com
