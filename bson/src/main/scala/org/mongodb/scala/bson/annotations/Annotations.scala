package org.mongodb.scala.bson.annotations

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros

class Key(val key: String) extends StaticAnnotation
