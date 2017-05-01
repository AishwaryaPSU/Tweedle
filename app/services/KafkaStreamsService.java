/**
 * 
 */
package services;

import models.TweedleRequest;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.kstream.KStream;

import play.mvc.WebSocket.Out;

/**
 * 
 *
 */
public interface KafkaStreamsService {
    public void stream(TweedleRequest tweedleRequest, Out<String> out);
}
