(function(){
    
    self.addEventListener('install', function(e) {
    e.waitUntil(
      caches.open('PWA_login').then(function(cache) {
        return cache.addAll([
          '/',

        ]);
      })
    );
    console.log("installion done.") ; 
    });

    self.addEventListener('activate',event=>{
        console.log('service worker activating...')
    })
 
    })