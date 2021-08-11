/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eoe
/*     */ {
/*     */   private final djz a;
/*     */   @Nullable
/*     */   private eof b;
/*  24 */   private List<a> c = Lists.newArrayList();
/*     */   
/*     */   public eoe(djz ☃) {
/*  27 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(dzk ☃) {
/*  31 */     if (this.b != null) {
/*  32 */       this.b.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1) {
/*  37 */     if (this.b != null) {
/*  38 */       this.b.a(☃, d1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(@Nullable dwt ☃, @Nullable dcl dcl1) {
/*  43 */     if (this.b != null && dcl1 != null && ☃ != null) {
/*  44 */       this.b.a(☃, dcl1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dwt ☃, fx fx1, ceh ceh1, float f) {
/*  49 */     if (this.b != null) {
/*  50 */       this.b.a(☃, fx1, ceh1, f);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  55 */     if (this.b != null) {
/*  56 */       this.b.c();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bmb ☃) {
/*  61 */     if (this.b != null) {
/*  62 */       this.b.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/*  67 */     if (this.b == null) {
/*     */       return;
/*     */     }
/*  70 */     this.b.b();
/*  71 */     this.b = null;
/*     */   }
/*     */   
/*     */   public void c() {
/*  75 */     if (this.b != null) {
/*  76 */       b();
/*     */     }
/*  78 */     this.b = this.a.k.D.a(this);
/*     */   }
/*     */   
/*     */   public void a(dms ☃, int i) {
/*  82 */     this.c.add(new a(☃, i));
/*  83 */     this.a.an().a(☃);
/*     */   }
/*     */   
/*     */   public void a(dms ☃) {
/*  87 */     this.c.removeIf(a1 -> (a.b(a1) == ☃));
/*  88 */     ☃.b();
/*     */   }
/*     */   
/*     */   public void d() {
/*  92 */     this.c.removeIf(☃ -> a.a((a)☃));
/*     */     
/*  94 */     if (this.b != null) {
/*  95 */       if (this.a.r != null) {
/*  96 */         this.b.a();
/*     */       } else {
/*  98 */         b();
/*     */       } 
/* 100 */     } else if (this.a.r != null) {
/* 101 */       c();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(eog ☃) {
/* 106 */     this.a.k.D = ☃;
/* 107 */     this.a.k.b();
/* 108 */     if (this.b != null) {
/* 109 */       this.b.b();
/* 110 */       this.b = ☃.a(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public djz e() {
/* 115 */     return this.a;
/*     */   }
/*     */   
/*     */   public bru f() {
/* 119 */     if (this.a.q == null) {
/* 120 */       return bru.a;
/*     */     }
/* 122 */     return this.a.q.l();
/*     */   }
/*     */   
/*     */   public static nr a(String ☃) {
/* 126 */     return (new nw("key." + ☃)).a(k.r);
/*     */   }
/*     */   
/*     */   static final class a {
/*     */     private final dms a;
/*     */     private final int b;
/*     */     private int c;
/*     */     
/*     */     private a(dms ☃, int i) {
/* 135 */       this.a = ☃;
/* 136 */       this.b = i;
/*     */     }
/*     */     
/*     */     private boolean a() {
/* 140 */       this.a.a(Math.min(++this.c / this.b, 1.0F));
/* 141 */       if (this.c > this.b) {
/* 142 */         this.a.b();
/* 143 */         return true;
/*     */       } 
/* 145 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eoe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */