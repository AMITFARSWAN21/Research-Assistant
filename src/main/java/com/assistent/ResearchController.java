package com.assistent;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/request")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {

private ResearchService researchService;

   @PostMapping("/process")
  public ResponseEntity<String>  processContent(@RequestBody ResearchRequest request)
  {
      String result=researchService.processContent(request);
      return ResponseEntity.ok(result);
  }

}

