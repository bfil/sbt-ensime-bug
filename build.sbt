import com.typesafe.sbt.SbtAspectj.{Aspectj, aspectjSettings, AspectjKeys}

aspectjSettings ++ Seq(
  javaOptions in run <++= AspectjKeys.weaverOptions in Aspectj,
  fork in run := true
)
