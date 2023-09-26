package com.example.demo.plugin;

import org.springframework.plugin.core.Plugin;

/**
 * @author kermit.mo
 */
public abstract class Cat implements Plugin<CatContext> {
    public abstract void shout();
}
