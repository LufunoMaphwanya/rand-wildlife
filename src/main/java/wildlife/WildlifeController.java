package wildlife;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wildlife.model.Animal;
import wildlife.model.AnimalClass;
import wildlife.model.AnimalDangerMatrix;
import wildlife.model.Wildlife;

@RestController
public class WildlifeController {

	private static BigInteger nextInt;
	private static Map<BigInteger, Wildlife> wildlifeMap;
	

    @RequestMapping("/api/wildlife")
    public Wildlife wildlife(@RequestParam(value="category", defaultValue="all") String category) {
        return new Animal("66", "dog","doggy dogg dog",new AnimalDangerMatrix(0,2,9), AnimalClass.MAMMAL);
 
    }
}
    

