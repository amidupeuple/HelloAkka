package com.pesiykot.main

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {
  override def receive: Receive = {
    case "hello" => println("hello back at u")
    case _ => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "com.pesiykot.main.HelloActor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
  //system.terminate
}
