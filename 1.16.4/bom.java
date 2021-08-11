/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class bom
/*     */   extends boj
/*     */ {
/*  20 */   private static final bon a = bon.a(new brw[] { bmd.oS, bmd.kT, bmd.nt, bmd.pe, bmd.pf, bmd.pi, bmd.pg, bmd.pj, bmd.ph });
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
/*  31 */   private static final bon b = bon.a(new brw[] { bmd.kg }); private static final Map<blx, blm.a> d;
/*  32 */   private static final bon c = bon.a(new brw[] { bmd.mk });
/*     */   static {
/*  34 */     d = x.<Map<blx, blm.a>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(bmd.oS, blm.a.b);
/*     */           ☃.put(bmd.kT, blm.a.e);
/*     */           ☃.put(bmd.nt, blm.a.c);
/*     */           ☃.put(bmd.pe, blm.a.d);
/*     */           ☃.put(bmd.pf, blm.a.d);
/*     */           ☃.put(bmd.pi, blm.a.d);
/*     */           ☃.put(bmd.pg, blm.a.d);
/*     */           ☃.put(bmd.pj, blm.a.d);
/*     */           ☃.put(bmd.ph, blm.a.d);
/*     */         });
/*     */   }
/*  46 */   private static final bon e = bon.a(new brw[] { bmd.kU });
/*     */   
/*     */   public bom(vk ☃) {
/*  49 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bio ☃, brx brx1) {
/*  54 */     boolean bool1 = false;
/*  55 */     boolean bool2 = false;
/*  56 */     boolean bool3 = false;
/*  57 */     boolean bool4 = false;
/*  58 */     boolean bool5 = false;
/*     */     
/*  60 */     for (int i = 0; i < ☃.Z_(); i++) {
/*  61 */       bmb bmb = ☃.a(i);
/*  62 */       if (!bmb.a())
/*     */       {
/*     */ 
/*     */         
/*  66 */         if (a.a(bmb)) {
/*  67 */           if (bool3) {
/*  68 */             return false;
/*     */           }
/*  70 */           bool3 = true;
/*  71 */         } else if (c.a(bmb)) {
/*  72 */           if (bool5) {
/*  73 */             return false;
/*     */           }
/*  75 */           bool5 = true;
/*  76 */         } else if (b.a(bmb)) {
/*  77 */           if (bool4) {
/*  78 */             return false;
/*     */           }
/*  80 */           bool4 = true;
/*  81 */         } else if (e.a(bmb)) {
/*  82 */           if (bool1) {
/*  83 */             return false;
/*     */           }
/*  85 */           bool1 = true;
/*  86 */         } else if (bmb.b() instanceof bky) {
/*  87 */           bool2 = true;
/*     */         } else {
/*  89 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  93 */     return (bool1 && bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bio ☃) {
/*  98 */     bmb bmb = new bmb(bmd.pp);
/*  99 */     md md = bmb.a("Explosion");
/*     */     
/* 101 */     blm.a a = blm.a.a;
/* 102 */     List<Integer> list = Lists.newArrayList();
/*     */     
/* 104 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 105 */       bmb bmb1 = ☃.a(i);
/* 106 */       if (!bmb1.a())
/*     */       {
/*     */ 
/*     */         
/* 110 */         if (a.a(bmb1)) {
/* 111 */           a = d.get(bmb1.b());
/* 112 */         } else if (c.a(bmb1)) {
/* 113 */           md.a("Flicker", true);
/* 114 */         } else if (b.a(bmb1)) {
/* 115 */           md.a("Trail", true);
/* 116 */         } else if (bmb1.b() instanceof bky) {
/* 117 */           list.add(Integer.valueOf(((bky)bmb1.b()).d().g()));
/*     */         } 
/*     */       }
/*     */     } 
/* 121 */     md.b("Colors", list);
/* 122 */     md.a("Type", (byte)a.a());
/*     */     
/* 124 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 129 */     return (☃ * i >= 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb c() {
/* 134 */     return new bmb(bmd.pp);
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/* 139 */     return bos.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */