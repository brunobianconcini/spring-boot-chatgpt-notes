package br.com.brunobianconcini.springbootchatgptnotes;

import reactor.core.publisher.Mono;

public interface StudyNotesService {
  Mono<String> createStudyNotes(String topic);
}
