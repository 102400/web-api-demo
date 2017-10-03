package com.vatcore.demo.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(path = Array("/api"))
class HelloController {

  @RequestMapping(path = Array("/hello"), method = Array(RequestMethod.GET))
  def hello(): Map[String, Any] = {
    Map(
      "helloArray" -> Array(
        Map(
          "hello" -> "Hello, World!",
          "language" -> "en"
        ),
        Map(
          "hello" -> "你好，世界！",
          "language" -> "zh"
        ),
        Map(
          "hello" -> "ハロー・ワールド",
          "language" -> "ja"
        )
      ),
      "now" -> new java.util.Date().getTime
    )
  }

}