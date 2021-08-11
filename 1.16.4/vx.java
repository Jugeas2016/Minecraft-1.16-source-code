/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vx
/*     */ {
/*  18 */   private static final vk a = new vk("tick");
/*  19 */   private static final vk b = new vk("load");
/*     */   
/*     */   private final MinecraftServer c;
/*     */   
/*     */   private boolean d;
/*  24 */   private final ArrayDeque<a> e = new ArrayDeque<>();
/*  25 */   private final List<a> f = Lists.newArrayList();
/*     */   
/*  27 */   private final List<cy> g = Lists.newArrayList();
/*     */   
/*     */   private boolean h;
/*     */   private vw i;
/*     */   
/*     */   public vx(MinecraftServer ☃, vw vw1) {
/*  33 */     this.c = ☃;
/*  34 */     this.i = vw1;
/*  35 */     b(vw1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/*  43 */     return this.c.aL().c(brt.v);
/*     */   }
/*     */   
/*     */   public CommandDispatcher<db> c() {
/*  47 */     return this.c.aD().a();
/*     */   }
/*     */   
/*     */   public void d() {
/*  51 */     a(this.g, a);
/*     */     
/*  53 */     if (this.h) {
/*  54 */       this.h = false;
/*  55 */       Collection<cy> ☃ = this.i.b().b(b).b();
/*  56 */       a(☃, b);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(Collection<cy> ☃, vk vk1) {
/*  61 */     this.c.aQ().a(vk1::toString);
/*  62 */     for (cy cy : ☃) {
/*  63 */       a(cy, e());
/*     */     }
/*  65 */     this.c.aQ().c();
/*     */   }
/*     */   
/*     */   public int a(cy ☃, db db1) {
/*  69 */     int i = b();
/*     */     
/*  71 */     if (this.d) {
/*     */       
/*  73 */       if (this.e.size() + this.f.size() < i) {
/*  74 */         this.f.add(new a(this, db1, new cy.d(☃)));
/*     */       }
/*  76 */       return 0;
/*     */     } 
/*     */     
/*     */     try {
/*  80 */       this.d = true;
/*  81 */       int j = 0;
/*  82 */       cy.c[] arrayOfC = ☃.b(); int k;
/*  83 */       for (k = arrayOfC.length - 1; k >= 0; k--) {
/*  84 */         this.e.push(new a(this, db1, arrayOfC[k]));
/*     */       }
/*     */       
/*  87 */       while (!this.e.isEmpty()) {
/*     */         try {
/*  89 */           a a = this.e.removeFirst();
/*  90 */           this.c.aQ().a(a::toString);
/*  91 */           a.a(this.e, i);
/*  92 */           if (!this.f.isEmpty()) {
/*  93 */             Lists.reverse(this.f).forEach(this.e::addFirst);
/*  94 */             this.f.clear();
/*     */           } 
/*     */         } finally {
/*  97 */           this.c.aQ().c();
/*     */         } 
/*  99 */         j++;
/*     */         
/* 101 */         if (j >= i) {
/* 102 */           k = j; return k;
/*     */         } 
/*     */       } 
/*     */       
/* 106 */       k = j; return k;
/*     */     } finally {
/*     */       
/* 109 */       this.e.clear();
/* 110 */       this.f.clear();
/* 111 */       this.d = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(vw ☃) {
/* 116 */     this.i = ☃;
/* 117 */     b(☃);
/*     */   }
/*     */   
/*     */   private void b(vw ☃) {
/* 121 */     this.g.clear();
/* 122 */     this.g.addAll(☃.b().b(a).b());
/* 123 */     this.h = true;
/*     */   }
/*     */   
/*     */   public db e() {
/* 127 */     return this.c.aE().a(2).a();
/*     */   }
/*     */   
/*     */   public Optional<cy> a(vk ☃) {
/* 131 */     return this.i.a(☃);
/*     */   }
/*     */   
/*     */   public ael<cy> b(vk ☃) {
/* 135 */     return this.i.b(☃);
/*     */   }
/*     */   
/*     */   public Iterable<vk> f() {
/* 139 */     return this.i.a().keySet();
/*     */   }
/*     */   
/*     */   public Iterable<vk> g() {
/* 143 */     return this.i.b().b();
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final vx a;
/*     */     private final db b;
/*     */     private final cy.c c;
/*     */     
/*     */     public a(vx ☃, db db1, cy.c c1) {
/* 152 */       this.a = ☃;
/* 153 */       this.b = db1;
/* 154 */       this.c = c1;
/*     */     }
/*     */     
/*     */     public void a(ArrayDeque<a> ☃, int i) {
/*     */       try {
/* 159 */         this.c.a(this.a, this.b, ☃, i);
/* 160 */       } catch (Throwable throwable) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 166 */       return this.c.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */