import ir.moke.module.timer.ModuleRunner;

module p01_basic {
    requires jos.api;
    requires org.slf4j;
    exports ir.moke.module.timer;
    provides ir.moke.jos.api.JModule with ModuleRunner;
}