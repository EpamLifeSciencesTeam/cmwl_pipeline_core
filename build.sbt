lazy val cmwl_pipeline_core = (project in file("."))
  .settings(
    name := "cmwl_pipeline_core"
  )
  .aggregate(cmwl_pipeline)

lazy val cmwl_pipeline = ProjectRef(file("cmwl_pipeline"), "root")
