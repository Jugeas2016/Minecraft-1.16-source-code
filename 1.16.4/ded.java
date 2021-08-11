/*     */ import it.unimi.dsi.fastutil.ints.IntArraySet;
/*     */ import it.unimi.dsi.fastutil.ints.IntCollection;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.lwjgl.stb.STBTTFontinfo;
/*     */ import org.lwjgl.stb.STBTruetype;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ded
/*     */   implements deb
/*     */ {
/*     */   private final ByteBuffer a;
/*     */   private final STBTTFontinfo b;
/*     */   private final float c;
/*  23 */   private final IntSet d = (IntSet)new IntArraySet();
/*     */   private final float e;
/*     */   private final float f;
/*     */   private final float g;
/*     */   private final float h;
/*     */   
/*     */   public ded(ByteBuffer ☃, STBTTFontinfo sTBTTFontinfo, float f1, float f2, float f3, float f4, String str) {
/*  30 */     this.a = ☃;
/*  31 */     this.b = sTBTTFontinfo;
/*     */     
/*  33 */     this.c = f2;
/*     */     
/*  35 */     str.codePoints().forEach(this.d::add);
/*     */     
/*  37 */     this.e = f3 * f2;
/*  38 */     this.f = f4 * f2;
/*     */     
/*  40 */     this.g = STBTruetype.stbtt_ScaleForPixelHeight(sTBTTFontinfo, f1 * f2);
/*     */     
/*  42 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/*  43 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/*  44 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/*  45 */       IntBuffer intBuffer3 = memoryStack.mallocInt(1);
/*  46 */       STBTruetype.stbtt_GetFontVMetrics(sTBTTFontinfo, intBuffer1, intBuffer2, intBuffer3);
/*     */       
/*  48 */       this.h = intBuffer1.get(0) * this.g;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public a b(int ☃) {
/*  55 */     if (this.d.contains(☃)) {
/*  56 */       return null;
/*     */     }
/*     */     
/*  59 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/*  60 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/*  61 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/*  62 */       IntBuffer intBuffer3 = memoryStack.mallocInt(1);
/*  63 */       IntBuffer intBuffer4 = memoryStack.mallocInt(1);
/*     */       
/*  65 */       int i = STBTruetype.stbtt_FindGlyphIndex(this.b, ☃);
/*  66 */       if (i == 0) {
/*  67 */         return null;
/*     */       }
/*     */       
/*  70 */       STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(this.b, i, this.g, this.g, this.e, this.f, intBuffer1, intBuffer2, intBuffer3, intBuffer4);
/*     */       
/*  72 */       int j = intBuffer3.get(0) - intBuffer1.get(0);
/*  73 */       int k = intBuffer4.get(0) - intBuffer2.get(0);
/*     */       
/*  75 */       if (j == 0 || k == 0) {
/*  76 */         return null;
/*     */       }
/*     */       
/*  79 */       IntBuffer intBuffer5 = memoryStack.mallocInt(1);
/*  80 */       IntBuffer intBuffer6 = memoryStack.mallocInt(1);
/*  81 */       STBTruetype.stbtt_GetGlyphHMetrics(this.b, i, intBuffer5, intBuffer6);
/*     */ 
/*     */       
/*  84 */       return new a(intBuffer1.get(0), intBuffer3.get(0), -intBuffer2.get(0), -intBuffer4.get(0), intBuffer5.get(0) * this.g, intBuffer6.get(0) * this.g, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  90 */     this.b.free();
/*  91 */     MemoryUtil.memFree(this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public IntSet a() {
/*  97 */     return IntStream.range(0, 65535).filter(☃ -> !this.d.contains(☃)).<IntSet>collect(it.unimi.dsi.fastutil.ints.IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
/*     */   }
/*     */   
/*     */   class a implements dec {
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final float d;
/*     */     private final float e;
/*     */     private final float f;
/*     */     private final int g;
/*     */     
/*     */     private a(ded this$0, int ☃, int i, int j, int k, float f1, float f2, int m) {
/* 109 */       this.b = i - ☃;
/* 110 */       this.c = j - k;
/*     */       
/* 112 */       this.f = f1 / ded.a(ded.this);
/*     */       
/* 114 */       this.d = (f2 + ☃ + ded.b(ded.this)) / ded.a(ded.this);
/* 115 */       this.e = (ded.c(ded.this) - j + ded.d(ded.this)) / ded.a(ded.this);
/*     */       
/* 117 */       this.g = m;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 122 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public int e() {
/* 127 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public float g() {
/* 132 */       return ded.a(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public float getAdvance() {
/* 137 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public float a() {
/* 142 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public float l() {
/* 147 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i) {
/* 152 */       det det = new det(det.a.d, this.b, this.c, false);
/* 153 */       det.a(ded.e(this.a), this.g, this.b, this.c, ded.f(this.a), ded.f(this.a), ded.b(this.a), ded.d(this.a), 0, 0);
/* 154 */       det.a(0, ☃, i, 0, 0, this.b, this.c, false, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean f() {
/* 159 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ded.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */