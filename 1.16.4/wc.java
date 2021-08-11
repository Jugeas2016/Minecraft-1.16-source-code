/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wc
/*     */   extends aad
/*     */ {
/*     */   private final vk h;
/*  23 */   private final Set<UUID> i = Sets.newHashSet();
/*     */   private int j;
/*  25 */   private int k = 100;
/*     */   
/*     */   public wc(vk ☃, nr nr1) {
/*  28 */     super(nr1, aok.a.g, aok.b.a);
/*  29 */     this.h = ☃;
/*  30 */     a(0.0F);
/*     */   }
/*     */   
/*     */   public vk a() {
/*  34 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aah ☃) {
/*  39 */     super.a(☃);
/*  40 */     this.i.add(☃.bS());
/*     */   }
/*     */   
/*     */   public void a(UUID ☃) {
/*  44 */     this.i.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aah ☃) {
/*  49 */     super.b(☃);
/*  50 */     this.i.remove(☃.bS());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  55 */     super.b();
/*  56 */     this.i.clear();
/*     */   }
/*     */   
/*     */   public int c() {
/*  60 */     return this.j;
/*     */   }
/*     */   
/*     */   public int d() {
/*  64 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  68 */     this.j = ☃;
/*  69 */     a(afm.a(☃ / this.k, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/*  73 */     this.k = ☃;
/*  74 */     a(afm.a(this.j / ☃, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public final nr e() {
/*  78 */     return ns.a(j()).a(☃ -> ☃.a(l().a()).a(new nv((nv.a)nv.a.a, (T)new oe(a().toString()))).a(a().toString()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(Collection<aah> ☃) {
/*  86 */     Set<UUID> set = Sets.newHashSet();
/*  87 */     Set<aah> set1 = Sets.newHashSet();
/*     */     
/*  89 */     for (UUID uUID : this.i) {
/*  90 */       boolean bool = false;
/*  91 */       for (aah aah : ☃) {
/*  92 */         if (aah.bS().equals(uUID)) {
/*  93 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/*  97 */       if (!bool) {
/*  98 */         set.add(uUID);
/*     */       }
/*     */     } 
/*     */     
/* 102 */     for (aah aah : ☃) {
/* 103 */       boolean bool = false;
/* 104 */       for (UUID uUID : this.i) {
/* 105 */         if (aah.bS().equals(uUID)) {
/* 106 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 110 */       if (!bool) {
/* 111 */         set1.add(aah);
/*     */       }
/*     */     } 
/*     */     
/* 115 */     for (UUID uUID : set) {
/* 116 */       for (aah aah : h()) {
/* 117 */         if (aah.bS().equals(uUID)) {
/* 118 */           b(aah);
/*     */           break;
/*     */         } 
/*     */       } 
/* 122 */       this.i.remove(uUID);
/*     */     } 
/*     */     
/* 125 */     for (aah aah : set1) {
/* 126 */       a(aah);
/*     */     }
/*     */     
/* 129 */     return (!set.isEmpty() || !set1.isEmpty());
/*     */   }
/*     */   
/*     */   public md f() {
/* 133 */     md ☃ = new md();
/*     */     
/* 135 */     ☃.a("Name", nr.a.a(this.a));
/* 136 */     ☃.a("Visible", g());
/* 137 */     ☃.b("Value", this.j);
/* 138 */     ☃.b("Max", this.k);
/* 139 */     ☃.a("Color", l().b());
/* 140 */     ☃.a("Overlay", m().a());
/* 141 */     ☃.a("DarkenScreen", n());
/* 142 */     ☃.a("PlayBossMusic", o());
/* 143 */     ☃.a("CreateWorldFog", p());
/*     */     
/* 145 */     mj mj = new mj();
/* 146 */     for (UUID uUID : this.i) {
/* 147 */       mj.add(mp.a(uUID));
/*     */     }
/* 149 */     ☃.a("Players", mj);
/*     */     
/* 151 */     return ☃;
/*     */   }
/*     */   
/*     */   public static wc a(md ☃, vk vk1) {
/* 155 */     wc wc1 = new wc(vk1, nr.a.a(☃.l("Name")));
/* 156 */     wc1.d(☃.q("Visible"));
/* 157 */     wc1.a(☃.h("Value"));
/* 158 */     wc1.b(☃.h("Max"));
/* 159 */     wc1.a(aok.a.a(☃.l("Color")));
/* 160 */     wc1.a(aok.b.a(☃.l("Overlay")));
/* 161 */     wc1.a(☃.q("DarkenScreen"));
/* 162 */     wc1.b(☃.q("PlayBossMusic"));
/* 163 */     wc1.c(☃.q("CreateWorldFog"));
/*     */     
/* 165 */     mj mj = ☃.d("Players", 11);
/* 166 */     for (int i = 0; i < mj.size(); i++) {
/* 167 */       wc1.a(mp.a(mj.k(i)));
/*     */     }
/*     */     
/* 170 */     return wc1;
/*     */   }
/*     */   
/*     */   public void c(aah ☃) {
/* 174 */     if (this.i.contains(☃.bS())) {
/* 175 */       a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(aah ☃) {
/* 180 */     super.b(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */