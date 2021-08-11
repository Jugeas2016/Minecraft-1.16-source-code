/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dli
/*     */   extends dkw
/*     */ {
/*  17 */   private static final vk a = new vk("textures/gui/bars.png");
/*     */ 
/*     */   
/*     */   private final djz b;
/*     */ 
/*     */   
/*  23 */   private final Map<UUID, dls> c = Maps.newLinkedHashMap();
/*     */   
/*     */   public dli(djz ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/*  30 */     if (this.c.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  34 */     int i = this.b.aD().o();
/*     */     
/*  36 */     int j = 12;
/*  37 */     for (dls dls : this.c.values()) {
/*  38 */       int k = i / 2 - 91;
/*     */       
/*  40 */       int m = j;
/*     */       
/*  42 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  43 */       this.b.M().a(a);
/*  44 */       a(☃, k, m, dls);
/*  45 */       nr nr = dls.j();
/*  46 */       int n = this.b.g.a(nr);
/*  47 */       int i1 = i / 2 - n / 2;
/*  48 */       int i2 = m - 9;
/*  49 */       this.b.g.a(☃, nr, i1, i2, 16777215);
/*  50 */       this.b.g.getClass(); j += 10 + 9;
/*     */       
/*  52 */       if (j >= this.b.aD().p() / 3) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, aok aok1) {
/*  59 */     b(☃, i, j, 0, aok1.l().ordinal() * 5 * 2, 182, 5);
/*  60 */     if (aok1.m() != aok.b.a) {
/*  61 */       b(☃, i, j, 0, 80 + (aok1.m().ordinal() - 1) * 5 * 2, 182, 5);
/*     */     }
/*  63 */     int k = (int)(aok1.k() * 183.0F);
/*  64 */     if (k > 0) {
/*  65 */       b(☃, i, j, 0, aok1.l().ordinal() * 5 * 2 + 5, k, 5);
/*  66 */       if (aok1.m() != aok.b.a) {
/*  67 */         b(☃, i, j, 0, 80 + (aok1.m().ordinal() - 1) * 5 * 2 + 5, k, 5);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(oz ☃) {
/*  73 */     if (☃.c() == oz.a.a) {
/*  74 */       this.c.put(☃.b(), new dls(☃));
/*  75 */     } else if (☃.c() == oz.a.b) {
/*  76 */       this.c.remove(☃.b());
/*     */     } else {
/*  78 */       ((dls)this.c.get(☃.b())).a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*  83 */     this.c.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  91 */     if (!this.c.isEmpty()) {
/*  92 */       for (aok ☃ : this.c.values()) {
/*  93 */         if (☃.o()) {
/*  94 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*  99 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 103 */     if (!this.c.isEmpty()) {
/* 104 */       for (aok ☃ : this.c.values()) {
/* 105 */         if (☃.n()) {
/* 106 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 115 */     if (!this.c.isEmpty()) {
/* 116 */       for (aok ☃ : this.c.values()) {
/* 117 */         if (☃.p()) {
/* 118 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 123 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dli.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */