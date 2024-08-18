package br.com.brunobianconcini.springbootchatgptnotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class StudyNotesController {
  @Autowired
  private StudyNotesService service;

  @PostMapping("study-notes-ai")
  public Mono<String> createStudyNotes(@RequestBody String topic) {
    return service.createStudyNotes(topic);
  }
}
