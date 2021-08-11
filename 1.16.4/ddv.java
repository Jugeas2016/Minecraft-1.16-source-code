/*     */ import com.google.common.collect.Sets;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.openal.AL;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import org.lwjgl.openal.ALC;
/*     */ import org.lwjgl.openal.ALC10;
/*     */ import org.lwjgl.openal.ALCCapabilities;
/*     */ import org.lwjgl.openal.ALCapabilities;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ddv
/*     */ {
/*     */   public enum c
/*     */   {
/*  27 */     a,
/*  28 */     b;
/*     */   }
/*     */ 
/*     */   
/*  32 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private long b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private long c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   private static final a d = new a()
/*     */     {
/*     */       @Nullable
/*     */       public ddu a() {
/*  57 */         return null;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(ddu ☃) {
/*  62 */         return false;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void b() {}
/*     */ 
/*     */       
/*     */       public int c() {
/*  71 */         return 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public int d() {
/*  76 */         return 0;
/*     */       }
/*     */     };
/*     */   
/*     */   static class b implements a {
/*     */     private final int a;
/*  82 */     private final Set<ddu> b = Sets.newIdentityHashSet();
/*     */     
/*     */     public b(int ☃) {
/*  85 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public ddu a() {
/*  91 */       if (this.b.size() >= this.a) {
/*  92 */         ddv.e().warn("Maximum sound pool size {} reached", Integer.valueOf(this.a));
/*  93 */         return null;
/*     */       } 
/*     */       
/*  96 */       ddu ☃ = ddu.a();
/*  97 */       if (☃ != null) {
/*  98 */         this.b.add(☃);
/*     */       }
/*     */       
/* 101 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ddu ☃) {
/* 106 */       if (!this.b.remove(☃)) {
/* 107 */         return false;
/*     */       }
/* 109 */       ☃.b();
/* 110 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 115 */       this.b.forEach(ddu::b);
/* 116 */       this.b.clear();
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 121 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 126 */       return this.b.size();
/*     */     }
/*     */   }
/*     */   
/* 130 */   private a e = d;
/* 131 */   private a f = d;
/*     */   
/* 133 */   private final ddw g = new ddw();
/*     */   
/*     */   public void a() {
/* 136 */     this.b = g();
/*     */     
/* 138 */     ALCCapabilities ☃ = ALC.createCapabilities(this.b);
/* 139 */     if (ddy.a(this.b, "Get capabilities")) {
/* 140 */       throw new IllegalStateException("Failed to get OpenAL capabilities");
/*     */     }
/*     */     
/* 143 */     if (!☃.OpenALC11) {
/* 144 */       throw new IllegalStateException("OpenAL 1.1 not supported");
/*     */     }
/*     */     
/* 147 */     this.c = ALC10.alcCreateContext(this.b, (IntBuffer)null);
/* 148 */     ALC10.alcMakeContextCurrent(this.c);
/*     */     
/* 150 */     int i = f();
/* 151 */     int j = afm.a((int)afm.c(i), 2, 8);
/* 152 */     int k = afm.a(i - j, 8, 255);
/*     */     
/* 154 */     this.e = new b(k);
/* 155 */     this.f = new b(j);
/*     */     
/* 157 */     ALCapabilities aLCapabilities = AL.createCapabilities(☃);
/* 158 */     ddy.a("Initialization");
/*     */     
/* 160 */     if (!aLCapabilities.AL_EXT_source_distance_model)
/*     */     {
/* 162 */       throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
/*     */     }
/* 164 */     AL10.alEnable(512);
/*     */     
/* 166 */     if (!aLCapabilities.AL_EXT_LINEAR_DISTANCE) {
/* 167 */       throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
/*     */     }
/* 169 */     ddy.a("Enable per-source distance models");
/* 170 */     a.info("OpenAL initialized.");
/*     */   }
/*     */   
/*     */   private int f() {
/* 174 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 175 */       int i = ALC10.alcGetInteger(this.b, 4098);
/* 176 */       if (ddy.a(this.b, "Get attributes size")) {
/* 177 */         throw new IllegalStateException("Failed to get OpenAL attributes");
/*     */       }
/*     */       
/* 180 */       IntBuffer intBuffer = ☃.mallocInt(i);
/* 181 */       ALC10.alcGetIntegerv(this.b, 4099, intBuffer);
/* 182 */       if (ddy.a(this.b, "Get attributes")) {
/* 183 */         throw new IllegalStateException("Failed to get OpenAL attributes");
/*     */       }
/*     */       
/* 186 */       int j = 0;
/* 187 */       while (j < i) {
/* 188 */         int k = intBuffer.get(j++);
/* 189 */         if (k == 0) {
/*     */           break;
/*     */         }
/* 192 */         int m = intBuffer.get(j++);
/*     */         
/* 194 */         if (k == 4112) {
/* 195 */           return m;
/*     */         }
/*     */       } 
/*     */     } 
/* 199 */     return 30;
/*     */   }
/*     */   
/*     */   private static long g() {
/* 203 */     for (int ☃ = 0; ☃ < 3; ☃++) {
/* 204 */       long l = ALC10.alcOpenDevice((ByteBuffer)null);
/*     */       
/* 206 */       if (l != 0L && !ddy.a(l, "Open device")) {
/* 207 */         return l;
/*     */       }
/*     */     } 
/*     */     
/* 211 */     throw new IllegalStateException("Failed to open OpenAL device");
/*     */   }
/*     */   
/*     */   public void b() {
/* 215 */     this.e.b();
/* 216 */     this.f.b();
/*     */     
/* 218 */     ALC10.alcDestroyContext(this.c);
/* 219 */     if (this.b != 0L) {
/* 220 */       ALC10.alcCloseDevice(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public ddw c() {
/* 225 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ddu a(c ☃) {
/* 230 */     return ((☃ == c.b) ? this.f : this.e).a();
/*     */   }
/*     */   
/*     */   public void a(ddu ☃) {
/* 234 */     if (!this.e.a(☃) && !this.f.a(☃)) {
/* 235 */       throw new IllegalStateException("Tried to release unknown channel");
/*     */     }
/*     */   }
/*     */   
/*     */   public String d() {
/* 240 */     return String.format("Sounds: %d/%d + %d/%d", new Object[] { Integer.valueOf(this.e.d()), Integer.valueOf(this.e.c()), Integer.valueOf(this.f.d()), Integer.valueOf(this.f.c()) });
/*     */   }
/*     */   
/*     */   static interface a {
/*     */     @Nullable
/*     */     ddu a();
/*     */     
/*     */     boolean a(ddu param1ddu);
/*     */     
/*     */     void b();
/*     */     
/*     */     int c();
/*     */     
/*     */     int d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */