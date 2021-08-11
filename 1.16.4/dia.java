/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dia
/*     */   extends eoo
/*     */ {
/*  15 */   private static final vk a = new vk("realms", "textures/gui/realms/invite_icon.png");
/*  16 */   private static final vk b = new vk("realms", "textures/gui/realms/trial_icon.png");
/*  17 */   private static final vk c = new vk("realms", "textures/gui/realms/news_notification_mainscreen.png");
/*     */   
/*  19 */   private static final dhl p = new dhl();
/*     */   
/*     */   private volatile int q;
/*     */   
/*     */   private static boolean r;
/*     */   
/*     */   private static boolean s;
/*     */   private static boolean t;
/*     */   private static boolean u;
/*     */   
/*     */   public void b() {
/*  30 */     k();
/*  31 */     this.i.m.a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  36 */     if ((!h() || !i() || !t) && !p.a()) {
/*  37 */       p.l();
/*     */       
/*     */       return;
/*     */     } 
/*  41 */     if (t && h()) {
/*  42 */       p.c();
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */     
/*  47 */     if (p.a(dhl.d.b)) {
/*  48 */       this.q = p.g();
/*     */     }
/*     */     
/*  51 */     if (p.a(dhl.d.c)) {
/*  52 */       s = p.h();
/*     */     }
/*     */     
/*  55 */     if (p.a(dhl.d.e)) {
/*  56 */       u = p.j();
/*     */     }
/*     */     
/*  59 */     p.d();
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  63 */     return this.i.k.T;
/*     */   }
/*     */   
/*     */   private boolean i() {
/*  67 */     return this.i.y instanceof doy;
/*     */   }
/*     */   
/*     */   private void k() {
/*  71 */     if (!r) {
/*  72 */       r = true;
/*     */       
/*  74 */       (new Thread(this, "Realms Notification Availability checker #1")
/*     */         {
/*     */           public void run() {
/*  77 */             dgb ☃ = dgb.a();
/*     */ 
/*     */             
/*     */             try {
/*  81 */               dgb.a a = ☃.i();
/*     */               
/*  83 */               if (a != dgb.a.a) {
/*     */                 return;
/*     */               }
/*  86 */             } catch (dhi dhi) {
/*  87 */               if (dhi.a != 401) {
/*  88 */                 dia.a(false);
/*     */               }
/*     */               
/*     */               return;
/*     */             } 
/*     */             
/*  94 */             dia.b(true);
/*     */           }
/*  96 */         }).start();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 102 */     if (t) {
/* 103 */       a(☃, i, j);
/*     */     }
/*     */     
/* 106 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j) {
/* 110 */     int k = this.q;
/*     */     
/* 112 */     int m = 24;
/* 113 */     int n = this.l / 4 + 48;
/*     */     
/* 115 */     int i1 = this.k / 2 + 80;
/* 116 */     int i2 = n + 48 + 2;
/*     */     
/* 118 */     int i3 = 0;
/*     */     
/* 120 */     if (u) {
/* 121 */       this.i.M().a(c);
/* 122 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 123 */       RenderSystem.pushMatrix();
/* 124 */       RenderSystem.scalef(0.4F, 0.4F, 0.4F);
/* 125 */       dkw.a(☃, (int)((i1 + 2 - i3) * 2.5D), (int)(i2 * 2.5D), 0.0F, 0.0F, 40, 40, 40, 40);
/* 126 */       RenderSystem.popMatrix();
/*     */       
/* 128 */       i3 += 14;
/*     */     } 
/*     */     
/* 131 */     if (k != 0) {
/* 132 */       this.i.M().a(a);
/* 133 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 134 */       dkw.a(☃, i1 - i3, i2 - 6, 0.0F, 0.0F, 15, 25, 31, 25);
/*     */       
/* 136 */       i3 += 16;
/*     */     } 
/*     */     
/* 139 */     if (s) {
/* 140 */       this.i.M().a(b);
/* 141 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 142 */       int i4 = 0;
/*     */       
/* 144 */       if ((x.b() / 800L & 0x1L) == 1L) {
/* 145 */         i4 = 8;
/*     */       }
/*     */       
/* 148 */       dkw.a(☃, i1 + 4 - i3, i2 + 4, 0.0F, i4, 8, 8, 8, 16);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 154 */     p.l();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */