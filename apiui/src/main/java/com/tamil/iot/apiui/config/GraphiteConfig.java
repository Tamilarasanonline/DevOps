package com.tamil.iot.apiui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.Clock;

//@Configuration
public class GraphiteConfig {

////	 @Autowired
////	    private MetricRegistry registry;
//
//	    @PostConstruct
//	    public void initialize() {
//	        final GraphiteMetricsExportAutoConfiguration graphite = new Graphite(new InetSocketAddress("localhost", 2003));
//	        final GraphiteReporter reporter = GraphiteReporter.forRegistry(registry)
//	                .prefixedWith("web1.example.com")
//	                .convertRatesTo(TimeUnit.SECONDS)
//	                .convertDurationsTo(TimeUnit.MILLISECONDS)
//	                .filter(MetricFilter.ALL)
//	                .build(graphite);
//	        reporter.start(1, TimeUnit.MINUTES);
//
//	    }
//
//	@Bean
//	public GraphiteMeterRegistry graphiteMeterRegistry(GraphiteConfig config, Clock clock) {
//		return new GraphiteMeterRegistry(config, clock, MY_HIERARCHICAL_MAPPER);
//	}
	
}
