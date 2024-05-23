# kafka-producer-consumer-upstash

In this story, I will share my experience of implementing a Kafka Streams Application with Upstash Serverless Kafka
platform.

For details of Upstash Kafka you can have a look at the documentation https://docs.upstash.com/kafka

Kafka Streams is a client library for processing and analyzing data stored in Apache Kafka. Kafka Streams provides
capabilities to process the Apache Kafka data as streams.

I implemented a simple Kafka Streams application with pure Java connecting to Upstash Serverless Kafka Platform. The
application reads a notification topic and splits the notifications according to their notification types.

Let’s run the application.

Forming the Kafka Cluster in Upstash:
a. Login to https://console.upstash.com/kafka and create a cluster

b. Create topics in cluster

And that’s it. Thank you for reading. Please do not hesitate to send comments, ideas and make corrections.
