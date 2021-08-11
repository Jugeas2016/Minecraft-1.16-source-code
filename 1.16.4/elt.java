/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class elt
/*     */   extends ack<els>
/*     */   implements AutoCloseable
/*     */ {
/*     */   private Map<vk, elo> a;
/*     */   @Nullable
/*     */   private ejr b;
/*     */   private final eaw c;
/*     */   private final ekd d;
/*     */   private final dko e;
/*     */   private int f;
/*     */   private elo g;
/*     */   private Object2IntMap<ceh> h;
/*     */   
/*     */   public elt(ekd ☃, dko dko1, int i) {
/*  31 */     this.d = ☃;
/*  32 */     this.e = dko1;
/*  33 */     this.f = i;
/*  34 */     this.c = new eaw(this);
/*     */   }
/*     */   
/*     */   public elo a(elu ☃) {
/*  38 */     return this.a.getOrDefault(☃, this.g);
/*     */   }
/*     */   
/*     */   public elo a() {
/*  42 */     return this.g;
/*     */   }
/*     */   
/*     */   public eaw b() {
/*  46 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected els a(ach ☃, anw anw1) {
/*  51 */     anw1.a();
/*  52 */     els els = new els(☃, this.e, anw1, this.f);
/*  53 */     anw1.b();
/*  54 */     return els;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(els ☃, ach ach1, anw anw1) {
/*  59 */     anw1.a();
/*     */     
/*  61 */     anw1.a("upload");
/*     */     
/*  63 */     if (this.b != null) {
/*  64 */       this.b.close();
/*     */     }
/*     */     
/*  67 */     this.b = ☃.a(this.d, anw1);
/*     */     
/*  69 */     this.a = ☃.a();
/*  70 */     this.h = ☃.b();
/*  71 */     this.g = this.a.get(els.l);
/*  72 */     anw1.b("cache");
/*  73 */     this.c.b();
/*     */     
/*  75 */     anw1.c();
/*  76 */     anw1.b();
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃, ceh ceh1) {
/*  80 */     if (☃ == ceh1) {
/*  81 */       return false;
/*     */     }
/*  83 */     int i = this.h.getInt(☃);
/*  84 */     if (i != -1) {
/*  85 */       int j = this.h.getInt(ceh1);
/*  86 */       if (i == j) {
/*  87 */         cux cux1 = ☃.m();
/*  88 */         cux cux2 = ceh1.m();
/*  89 */         return (cux1 != cux2);
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   public ekb a(vk ☃) {
/*  97 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 102 */     if (this.b != null) {
/* 103 */       this.b.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 108 */     this.f = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */