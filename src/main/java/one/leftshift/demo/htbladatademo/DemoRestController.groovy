package one.leftshift.demo.htbladatademo

import one.leftshift.demo.htbladatademo.model.SkiRegion
import one.leftshift.demo.htbladatademo.service.SkiRegionProviderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author bnjm@harmless.ninja - 11/9/17.
 */
@RestController
@CrossOrigin
class DemoRestController {
    private final SkiRegionProviderService providerService;

    @Autowired
    DemoRestController(SkiRegionProviderService providerService) {
        this.providerService = providerService;
    }

    @RequestMapping("/api/v1/regions")
    ResponseEntity<List<SkiRegion>> regions() {
        return new ResponseEntity<>(providerService.provide(), HttpStatus.OK);
    }
}
