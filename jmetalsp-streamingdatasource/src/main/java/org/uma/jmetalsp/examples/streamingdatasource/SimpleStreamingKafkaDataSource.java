package org.uma.jmetalsp.examples.streamingdatasource;

import org.uma.jmetalsp.kafka.Consumer;
import org.uma.jmetalsp.kafka.KafkaProperties;
import org.uma.jmetalsp.StreamingDataSource;
import org.uma.jmetalsp.observeddata.SingleObservedData;
import org.uma.jmetalsp.observer.Observable;

public class SimpleStreamingKafkaDataSource implements StreamingDataSource<SingleObservedData<Integer>, Observable<SingleObservedData<Integer>>> {
	private Observable<SingleObservedData<Integer>> observable;
	
	public SimpleStreamingKafkaDataSource(Observable<SingleObservedData<Integer>> observable, int dataDelay) {
		this.observable = observable ;
	}
	
	@Override
	public void run() {
	
				Consumer consumerThread = new Consumer(KafkaProperties.TOPIC,this.observable);
			    consumerThread.start();	
	}

}
