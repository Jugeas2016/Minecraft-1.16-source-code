/*     */ package com.mojang.blaze3d.platform;
/*     */ 
/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import del;
/*     */ import dem;
/*     */ import dez;
/*     */ import dfh;
/*     */ import dfk;
/*     */ import dfo;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.LongSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.Version;
/*     */ import org.lwjgl.glfw.GLFW;
/*     */ import org.lwjgl.glfw.GLFWErrorCallback;
/*     */ import org.lwjgl.glfw.GLFWErrorCallbackI;
/*     */ import org.lwjgl.glfw.GLFWVidMode;
/*     */ import org.lwjgl.opengl.GL;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLCapabilities;
/*     */ import oshi.SystemInfo;
/*     */ import oshi.hardware.Processor;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GLX
/*     */ {
/*  36 */   private static final Logger LOGGER = LogManager.getLogger();
/*     */   
/*     */   public static String getOpenGLVersionString() {
/*  39 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  40 */     if (GLFW.glfwGetCurrentContext() == 0L) {
/*  41 */       return "NO CONTEXT";
/*     */     }
/*  43 */     return dem.B(7937) + " GL version " + dem.B(7938) + ", " + dem.B(7936);
/*     */   }
/*     */   
/*     */   public static int _getRefreshRate(dez ☃) {
/*  47 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/*  48 */     long l = GLFW.glfwGetWindowMonitor(☃.i());
/*  49 */     if (l == 0L) {
/*  50 */       l = GLFW.glfwGetPrimaryMonitor();
/*     */     }
/*  52 */     GLFWVidMode gLFWVidMode = (l == 0L) ? null : GLFW.glfwGetVideoMode(l);
/*  53 */     return (gLFWVidMode == null) ? 0 : gLFWVidMode.refreshRate();
/*     */   }
/*     */   
/*     */   public static String _getLWJGLVersion() {
/*  57 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*  58 */     return Version.getVersion();
/*     */   }
/*     */   public static LongSupplier _initGlfw() {
/*     */     LongSupplier longSupplier;
/*  62 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*  63 */     dez.a((☃, str) -> {
/*     */           throw new IllegalStateException(String.format("GLFW error before init: [0x%X]%s", new Object[] { ☃, str }));
/*     */         });
/*     */     
/*  67 */     List<String> ☃ = Lists.newArrayList();
/*     */     
/*  69 */     GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((i, l) -> ☃.add(String.format("GLFW error during init: [0x%X]%s", new Object[] { Integer.valueOf(i), Long.valueOf(l) })));
/*     */ 
/*     */     
/*  72 */     if (GLFW.glfwInit()) {
/*  73 */       longSupplier = (() -> (long)(GLFW.glfwGetTime() * 1.0E9D));
/*     */       
/*  75 */       for (String str : ☃) {
/*  76 */         LOGGER.error("GLFW error collected during initialization: {}", str);
/*     */       }
/*     */     } else {
/*  79 */       throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on(",").join(☃));
/*     */     } 
/*     */     
/*  82 */     RenderSystem.setErrorCallback((GLFWErrorCallbackI)gLFWErrorCallback);
/*  83 */     return longSupplier;
/*     */   }
/*     */   
/*     */   public static void _setGlfwErrorCallback(GLFWErrorCallbackI ☃) {
/*  87 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/*  88 */     GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback(☃);
/*  89 */     if (gLFWErrorCallback != null) {
/*  90 */       gLFWErrorCallback.free();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean _shouldClose(dez ☃) {
/*  96 */     return GLFW.glfwWindowShouldClose(☃.i());
/*     */   }
/*     */   
/*     */   public static void _setupNvFogDistance() {
/* 100 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 101 */     if ((GL.getCapabilities()).GL_NV_fog_distance) {
/* 102 */       dem.l(34138, 34139);
/*     */     }
/*     */   }
/*     */   
/* 106 */   private static String capsString = ""; private static String cpuInfo;
/*     */   private static final Map<Integer, String> LOOKUP_MAP;
/*     */   
/*     */   public static void _init(int ☃, boolean bool) {
/* 110 */     RenderSystem.assertThread(RenderSystem::isInInitPhase);
/* 111 */     GLCapabilities gLCapabilities = GL.getCapabilities();
/*     */     
/* 113 */     capsString = "Using framebuffer using " + dem.a(gLCapabilities);
/*     */     
/*     */     try {
/* 116 */       Processor[] arrayOfProcessor = (new SystemInfo()).getHardware().getProcessors();
/* 117 */       cpuInfo = String.format("%dx %s", new Object[] { Integer.valueOf(arrayOfProcessor.length), arrayOfProcessor[0] }).replaceAll("\\s+", " ");
/* 118 */     } catch (Throwable throwable) {}
/*     */ 
/*     */     
/* 121 */     del.a(☃, bool);
/*     */   }
/*     */   
/*     */   public static String _getCapsString() {
/* 125 */     return capsString;
/*     */   }
/*     */   
/*     */   public static String _getCpuInfo() {
/* 129 */     return (cpuInfo == null) ? "<unknown>" : cpuInfo;
/*     */   }
/*     */   
/*     */   public static void _renderCrosshair(int ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 133 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 134 */     dem.L();
/* 135 */     dem.a(false);
/*     */     
/* 137 */     dfo dfo = RenderSystem.renderThreadTesselator();
/* 138 */     dfh dfh = dfo.c();
/* 139 */     GL11.glLineWidth(4.0F);
/* 140 */     dfh.a(1, dfk.l);
/* 141 */     if (bool1) {
/* 142 */       dfh.a(0.0D, 0.0D, 0.0D).a(0, 0, 0, 255).d();
/* 143 */       dfh.a(☃, 0.0D, 0.0D).a(0, 0, 0, 255).d();
/*     */     } 
/* 145 */     if (bool2) {
/* 146 */       dfh.a(0.0D, 0.0D, 0.0D).a(0, 0, 0, 255).d();
/* 147 */       dfh.a(0.0D, ☃, 0.0D).a(0, 0, 0, 255).d();
/*     */     } 
/* 149 */     if (bool3) {
/* 150 */       dfh.a(0.0D, 0.0D, 0.0D).a(0, 0, 0, 255).d();
/* 151 */       dfh.a(0.0D, 0.0D, ☃).a(0, 0, 0, 255).d();
/*     */     } 
/* 153 */     dfo.b();
/* 154 */     GL11.glLineWidth(2.0F);
/* 155 */     dfh.a(1, dfk.l);
/* 156 */     if (bool1) {
/* 157 */       dfh.a(0.0D, 0.0D, 0.0D).a(255, 0, 0, 255).d();
/* 158 */       dfh.a(☃, 0.0D, 0.0D).a(255, 0, 0, 255).d();
/*     */     } 
/* 160 */     if (bool2) {
/* 161 */       dfh.a(0.0D, 0.0D, 0.0D).a(0, 255, 0, 255).d();
/* 162 */       dfh.a(0.0D, ☃, 0.0D).a(0, 255, 0, 255).d();
/*     */     } 
/* 164 */     if (bool3) {
/* 165 */       dfh.a(0.0D, 0.0D, 0.0D).a(127, 127, 255, 255).d();
/* 166 */       dfh.a(0.0D, 0.0D, ☃).a(127, 127, 255, 255).d();
/*     */     } 
/* 168 */     dfo.b();
/*     */     
/* 170 */     GL11.glLineWidth(1.0F);
/* 171 */     dem.a(true);
/* 172 */     dem.K();
/*     */   }
/*     */   static {
/* 175 */     LOOKUP_MAP = make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(Integer.valueOf(0), "No error");
/*     */           ☃.put(Integer.valueOf(1280), "Enum parameter is invalid for this function");
/*     */           ☃.put(Integer.valueOf(1281), "Parameter is invalid for this function");
/*     */           ☃.put(Integer.valueOf(1282), "Current state is invalid for this function");
/*     */           ☃.put(Integer.valueOf(1283), "Stack overflow");
/*     */           ☃.put(Integer.valueOf(1284), "Stack underflow");
/*     */           ☃.put(Integer.valueOf(1285), "Out of memory");
/*     */           ☃.put(Integer.valueOf(1286), "Operation on incomplete framebuffer");
/*     */           ☃.put(Integer.valueOf(1286), "Operation on incomplete framebuffer");
/*     */         });
/*     */   }
/*     */   public static String getErrorString(int ☃) {
/* 188 */     return LOOKUP_MAP.get(Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public static <T> T make(Supplier<T> ☃) {
/* 192 */     return ☃.get();
/*     */   }
/*     */   
/*     */   public static <T> T make(T ☃, Consumer<T> consumer) {
/* 196 */     consumer.accept(☃);
/* 197 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\com\mojang\blaze3d\platform\GLX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */